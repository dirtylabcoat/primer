const apiBaseUrl = 'PRIMER_API_BASE_URL';

function getIsPrime(num) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', apiBaseUrl + '/primer/api/calculate/is-prime?num=' + num);
    xhr.onreadystatechange = function() {
        console.log(xhr.responseText);
        var data;
        var isPrime;
        if (xhr.readyState == 4 && xhr.status == 200) {
            data = JSON.parse(xhr.responseText);
            isPrime = data.isPrime ? 'yes' : 'no';
            document.getElementById('output-is-prime').innerText = isPrime;
        }
    }
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send();
}

function getNthPrime(n) {
    var xhr = new XMLHttpRequest();
    //xhr.open('POST', '');
    xhr.open('GET', apiBaseUrl + '/primer/api/calculate/nth?n=' + n);
    xhr.onreadystatechange = function() {
        console.log(xhr.responseText);
        var data;
        if (xhr.readyState == 4 && xhr.status == 200) {
            data = JSON.parse(xhr.responseText);
            document.getElementById('output-nth-prime').innerText = data.nth;
        }
    }
    xhr.setRequestHeader('Content-Type', 'application/json');
    //xhr.send(JSON.stringify({n: 213}));
    xhr.send();
}

