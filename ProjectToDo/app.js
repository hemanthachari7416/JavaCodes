// ********** SELECT ITEMS **********
const form = document.querySelector(".todo-form");
const alertMessage = document.querySelector(".alert");
const todo = document.querySelector("#todo");
const submitBtn = document.querySelector(".submit-btn");
const container = document.querySelector(".todo-container");
const list = document.querySelector(".todo-list");
const clearBtn = document.querySelector(".clear-btn");

// ********** Edit ITEMS **********
let editElement;
let editFlag = false;
let editID;

// ********** EVENT LISTENERS **********
form.addEventListener("submit", addTodo);
clearBtn.addEventListener("click", clearTodos);
window.addEventListener("DOMContentLoaded", setupAllTodos);

// ********** FUNCTIONS **********
function addTodo(e) {
    e.preventDefault();
    let id = new Date().getTime().toString();
    let value = todo.value;

    // Empty value(todo) validation
    if (value === "") {
        displayMessage("danger", "please enter a value");
        return;
    }

    if (editFlag) {
        editElement.textContent = value;
        editFromLocalStorage(editID, value);
        displayMessage("success", "todo modified");
        resetToDefault();
        return;
    }

    let element = document.createElement("article");
    let attr = document.createAttribute("data-id");
    attr.value = id;
    element.setAttributeNode(attr);
    element.classList.add("todo-item");

    element.innerHTML = `
        <p class="title">${value}</p>
        <div class="btn-container">
            <!-- edit btn -->
            <button type="button" class="edit-btn">
            <i class="fas fa-edit"></i>
            </button>
            <!-- delete btn -->
            <button type="button" class="delete-btn">
            <i class="fas fa-trash"></i>
            </button>
        </div>
    `;

    let editBtn = element.querySelector(".edit-btn");
    editBtn.addEventListener("click", editTodo);
    let deleteBtn = element.querySelector(".delete-btn");
    deleteBtn.addEventListener("click", deleteTodo);

    list.appendChild(element);
    addToLocalStorage(id, value);
    container.classList.add("show-container");
    displayMessage("success", "Todo added successfully");
    resetToDefault();
}

function deleteTodo(e) {
    let element = e.currentTarget.parentElement.parentElement;
    list.removeChild(element);
    displayMessage("danger", "Todo deleted");
    deleteFromLocalStorage(element.dataset.id);

    if (list.children.length === 0) {
        container.classList.remove("show-container");
    }
}

function editTodo(e) {
    let element = e.currentTarget.parentElement.parentElement;
    editElement = e.currentTarget.parentElement.previousElementSibling;
    todo.value = editElement.textContent;
    editFlag = true;
    editID = element.dataset.id;
    submitBtn.textContent = "edit";
}

function clearTodos() {
    let todos = document.querySelectorAll(".todo-item");
    for (const todo of todos) {
        list.removeChild(todo);
    }

    container.classList.remove("show-container");
    localStorage.removeItem("todos");
    displayMessage("danger", "all todos cleared");
}

function displayMessage(className, message) {
    alertMessage.textContent = message;
    alertMessage.classList.add(`alert-${className}`);

    setTimeout(() => {
        alertMessage.textContent = "";
        alertMessage.classList.remove(`alert-${className}`);
    }, 1500);
}

function resetToDefault() {
    todo.value = "";
    submitBtn.textContent = "submit";
    editFlag = false;
    editElement = undefined;
    editID = undefined;
}

// ********** LOCAL STORAGE **********
function getFromLocalStorage() {
    let todos = localStorage.getItem("todos");
    return todos ? JSON.parse(todos) : [];
}
function addToLocalStorage(id, value) {
    let todos = getFromLocalStorage();
    let newTodo = { id, value }; // same as {id: id, value: value}
    todos.push(newTodo);
    localStorage.setItem("todos", JSON.stringify(todos));
}

function deleteFromLocalStorage(id) {
    let todos = getFromLocalStorage();
    let updatedTodos = todos.filter((todo) => {
        if (todo.id !== id) {
            return todo;
        }
    });
    localStorage.setItem("todos", JSON.stringify(updatedTodos));
}

function editFromLocalStorage(id, value) {
    let todos = getFromLocalStorage();
    let updatedTodos = todos.map((todo) => {
        if (todo.id === id) {
            todo.value = value;
        }
        return todo;
    });
    localStorage.setItem("todos", JSON.stringify(updatedTodos));
}

// ********** SETUP ITEMS **********
function setupAllTodos() {
    let todos = getFromLocalStorage();
    for (const todo of todos) {
        setupTodo(todo.id, todo.value);
    }

    container.classList.add("show-container");
}

function setupTodo(id, value) {
    let element = document.createElement("article");
    let attr = document.createAttribute("data-id");
    attr.value = id;
    element.setAttributeNode(attr);
    element.classList.add("todo-item");

    element.innerHTML = `
        <p class="title">${value}</p>
        <div class="btn-container">
            <!-- edit btn -->
            <button type="button" class="edit-btn">
            <i class="fas fa-edit"></i>
            </button>
            <!-- delete btn -->
            <button type="button" class="delete-btn">
            <i class="fas fa-trash"></i>
            </button>
        </div>
    `;

    let editBtn = element.querySelector(".edit-btn");
    editBtn.addEventListener("click", editTodo);
    let deleteBtn = element.querySelector(".delete-btn");
    deleteBtn.addEventListener("click", deleteTodo);

    list.appendChild(element);
}
