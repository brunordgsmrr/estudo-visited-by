let tbody = document.querySelector("table tbody")

let nome = document.querySelector("#name")

document.querySelector('.form').addEventListener('submit', (event)=>{

    event.preventDefault();

    let td = document.createElement('td');

    td.textContent = nome.value;

    let tr = document.createElement('tr');

    tr.appendChild(td);

    tbody.appendChild(tr);

    nome.value = '';

})