function getIsPrime(num) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'http://localhost:8080/primer/api/calculate/is-prime?num=' + num);
    xhr.onreadystatechange = function(event) {
        console.log(event.target.response);
        document.getElementById('output-is-prime').innerText = event.target.response;
    }
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send();
}

function getNthPrime(n) {
    var xhr = new XMLHttpRequest();
    //xhr.open('POST', '');
    xhr.open('GET', 'http://localhost:8080/primer/api/calculate/nth?n=' + n);
    xhr.onreadystatechange = function(event) {
        console.log(event.target.response);
        document.getElementById('output-nth-prime').innerText = event.target.response;
    }
    xhr.setRequestHeader('Content-Type', 'application/json');
    //xhr.send(JSON.stringify({n: 213}));
    xhr.send();
}
