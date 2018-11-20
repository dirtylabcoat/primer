function getIsPrime(n) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'PATH?n=' + n);
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
    xhr.open('GET', 'PATH?n=' + n);
    xhr.onreadystatechange = function(event) {
        console.log(event.target.response);
        document.getElementById('output-nth-prime').innerText = event.target.response;
    }
    xhr.setRequestHeader('Content-Type', 'application/json');
    //xhr.send(JSON.stringify({n: 213}));
    xhr.send();
}
