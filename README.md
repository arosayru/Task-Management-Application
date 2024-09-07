Task Management Application
This is a Task Management Application built using React for the frontend and Spring Boot for the backend. The application is designed to manage tasks, projects, and users efficiently. It includes features like user management, project management, and task management.

Key Features
The Task Management Application offers three main features:

User Management:

Add, edit, and delete users.
Manage user roles and assign tasks to users.
Project Management:

Create, edit, and delete projects.
Assign projects to tasks for better task management.
Task Management:

Create, edit, and delete tasks.
Assign tasks to users and link them to specific projects.
Set the task status (Pending, In Progress, Completed) and due dates.
Frontend
The frontend of this application is built using React and manages the UI/UX of the application. The frontend is responsible for handling user interactions and displaying the data fetched from the backend.

Technologies Used:
React: For building the user interface and handling user interactions.
React Router: For managing navigation between different views.
Axios: For handling HTTP requests and connecting the frontend to the backend.
CSS: For styling the UI and ensuring a responsive design.
Features of the Frontend:
Dynamic UI: The interface updates dynamically based on user actions and data from the backend.
Search and Filter: Tasks and users can be searched and filtered using the provided search bar.
CRUD Operations: The frontend allows Create, Read, Update, and Delete operations for users, tasks, and projects.
State Management: The application uses useState and useEffect hooks for managing component state and side effects.
Form Validation: Frontend validation is implemented to ensure that required fields are filled before submission.
Frontend to Backend Communication:
The frontend communicates with the backend through RESTful APIs using Axios for HTTP requests. Here’s an example of the data flow between the frontend and backend:

GET Requests: To fetch users, tasks, and projects from the backend to display in the UI.
POST Requests: To add new tasks, projects, and users to the backend.
PUT Requests: To update existing tasks, projects, and user details.
DELETE Requests: To remove tasks, users, or projects from the database.
Backend
The backend is built using Spring Boot and handles data storage and business logic. It exposes REST APIs that the frontend interacts with.

Backend Technologies:
Spring Boot: For developing RESTful APIs and handling backend services.
MySQL: For storing data (users, tasks, projects) persistently in the database.
Backend Setup:
All data from the frontend (such as user details, task details, and project details) is sent to the backend through HTTP requests.
The backend processes these requests and performs the necessary database operations.
The backend is also responsible for retrieving data from the database and sending it back to the frontend as JSON.
