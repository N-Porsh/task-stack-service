## Task Description
#####Goal:
1. Create stack service

#####Tasks:
1. Build stack service
    * Server app acceptance criteria:
        1. Holds a unique stack for every user session
        2. On push request, adds a number to the stack
        3. On pop request, removes last number from the stack
        4. On reset request, resets the stack
        5. On view request, responses with the stack
    * Dockerize the service
    * Upload the code and Dockerfile to a git repository

2. Build client app
    * Client app acceptance criteria:
        1. It is possible to add a number (Integer) to the stack (push)
        2. It is possible to remove last number from the stack (pop)
        3. It is possible to reset the stack (reset)
        4. It is possible to view current state of the stack (view)
    * Dockerize the service
    * Upload the code and Dockerfile to a git repository
3. Create a clear step-by-step guide how to get everything up and running
4. Share the repositories and the guide with us: employme@fob-solutions.com

####Technical requirements:
1. Server app: Java
2. Client app: HTML, CSS, JavaScript/TypeScript

• Everything else is up to you

####Client app UI requirements:
1. Mobile-first approach
2. User-friendly design

***************************
## Installation:
1. clone this repository
2. Open terminal from where you can use Docker CLI and navigate to cloned source code, then:
    1. `docker build -t stackapp .`<= dot here!
    2. `docker run -d -p 80:80 stackapp`

3. If application ran then you can browse the app
    * If you are running on 'Docker for Linux/MAC': [http://127.0.0.1](http://127.0.0.1)
    * If you are using Docker Toolbox: [http://192.168.99.100](http://192.168.99.100)