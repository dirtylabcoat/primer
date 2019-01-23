# Primer
Basic project for use in various types of experiments. Based around prime numbers because that's what all the cool kids do.

The project is made up of two modules, a web front-end and a Java back-end.

## primer-webui
This is the web interface. It sucks pretty bad right now. Very basic JavaScript and HTML (no CSS...). It makes REST-calls to the back-end and displays the results.

## primer-api
This is a small Java EE back-end with two REST end-points. Build it with Maven, like this:

    cd primer-api && mvn clean package

The finished WAR-file will be in the *target*-directory.

## Run with Docker
Run the script in the root-directory.

    ./run-w-docker.sh

Open [http://localhost/index.html](http://localhost/index.html) to try it out.


