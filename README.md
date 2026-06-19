# Home Projects API

A Spring Boot REST API for tracking home renovation projects. Each project has a title, the room it belongs to, an estimated cost, a status, and a priority. The app connects to a MySQL database and saves the data there.

## Built With

Java 21, Spring Boot, Spring Data JPA, and MySQL.

## How It Works

The project uses a layered setup. The model is the HomeProject class. The repository talks to the database. The service holds the logic. The controller handles the web requests at /api/projects.

## Endpoints

GET /api/projects returns all projects.
GET /api/projects/{id} returns one project by its id.
POST /api/projects creates a new project.
PUT /api/projects/{id} updates an existing project.
DELETE /api/projects/{id} deletes a project.

## Running It

Make sure MySQL is running. Open the project, then run HomeProjectApp. The app starts on port 8080 and creates the database table on its own.

## Testing

All five endpoints were tested in Postman. Screenshots of the requests and responses are included in the project.
