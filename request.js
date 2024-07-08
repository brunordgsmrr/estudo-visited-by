const xhr = new XMLHttpRequest();

export function request() {
    let response;
    xhr.open("GET", "http://localhost:8080/all", true);

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            response = JSON.parse(xhr.responseText);
            console.log(response)
        }
    };

    xhr.send();

    return response;
}
