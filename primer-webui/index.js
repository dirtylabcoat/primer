const apiBaseUrl = 'PRIMER_API_BASE_URL';

function getIsPrime(num) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', apiBaseUrl + '/primer/api/calculate/is-prime?num=' + num);
    xhr.onreadystatechange = function(event) {
        console.log(event.target.response);
        var responseJson = JSON.parse(event.target.response);
        var isPrime = responseJson.isPrime ? 'yes' : 'no';
        document.getElementById('output-is-prime').innerText = isPrime;
    }
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send();
}

function getNthPrime(n) {
    var xhr = new XMLHttpRequest();
    //xhr.open('POST', '');
    xhr.open('GET', apiBaseUrl + '/primer/api/calculate/nth?n=' + n);
    xhr.onreadystatechange = function(event) {
        console.log(event.target.response);
        var responseJson = JSON.parse(event.target.response);
        document.getElementById('output-nth-prime').innerText = responseJson.nth;
    }
    xhr.setRequestHeader('Content-Type', 'application/json');
    //xhr.send(JSON.stringify({n: 213}));
    xhr.send();
}
