<!DOCTYPE html>
<html lang="en">
<body>

<h1>Task Management Application</h1>

<p>This is a <strong>Task Management Application</strong> built using <strong>React</strong> for the frontend and <strong>Spring Boot</strong> for the backend. The application is designed to manage tasks, projects, and users efficiently. It includes features like user management, project management, and task management.</p>

<h2>Key Features</h2>
<p>The Task Management Application offers three main features:</p>
<ul>
    <li><strong>User Management</strong>: Add, edit, and delete users. Manage user roles and assign tasks to users.</li>
    <li><strong>Project Management</strong>: Create, edit, and delete projects. Assign projects to tasks for better task management.</li>
    <li><strong>Task Management</strong>: Create, edit, and delete tasks. Assign tasks to users and link them to specific projects. Set the task status (Pending, In Progress, Completed) and due dates.</li>
</ul>

<h2>Frontend</h2>
<p>The frontend of this application is built using <strong>React</strong> and manages the UI/UX of the application. The frontend is responsible for handling user interactions and displaying the data fetched from the backend.</p>

<h3>Technologies Used</h3>
<ul>
    <li><strong>React</strong>: For building the user interface and handling user interactions.</li>
    <li><strong>React Router</strong>: For managing navigation between different views.</li>
    <li><strong>Axios</strong>: For handling HTTP requests and connecting the frontend to the backend.</li>
    <li><strong>CSS</strong>: For styling the UI and ensuring a responsive design.</li>
</ul>

<h3>Features of the Frontend</h3>
<ul>
    <li><strong>Dynamic UI</strong>: The interface updates dynamically based on user actions and data from the backend.</li>
    <li><strong>Search and Filter</strong>: Tasks and users can be searched and filtered using the provided search bar.</li>
    <li><strong>CRUD Operations</strong>: The frontend allows Create, Read, Update, and Delete operations for users, tasks, and projects.</li>
    <li><strong>State Management</strong>: The application uses <code>useState</code> and <code>useEffect</code> hooks for managing component state and side effects.</li>
    <li><strong>Form Validation</strong>: Frontend validation is implemented to ensure that required fields are filled before submission.</li>
</ul>

<h3>Frontend to Backend Communication</h3>
<p>The frontend communicates with the backend through RESTful APIs using <strong>Axios</strong> for HTTP requests. Here’s an example of the data flow between the frontend and backend:</p>
<ul>
    <li><strong>GET Requests</strong>: To fetch users, tasks, and projects from the backend to display in the UI.</li>
    <li><strong>POST Requests</strong>: To add new tasks, projects, and users to the backend.</li>
    <li><strong>PUT Requests</strong>: To update existing tasks, projects, and user details.</li>
    <li><strong>DELETE Requests</strong>: To remove tasks, users, or projects from the database.</li>
</ul>

<h2>Backend</h2>
<p>The backend is built using <strong>Spring Boot</strong> and handles data storage and business logic. It exposes REST APIs that the frontend interacts with.</p>

<h3>Backend Technologies</h3>
<ul>
    <li><strong>Spring Boot</strong>: For developing RESTful APIs and handling backend services.</li>
    <li><strong>MySQL</strong>: For storing data (users, tasks, projects) persistently in the database.</li>
</ul>

<h3>Backend Setup</h3>
<ul>
    <li>All data from the frontend (such as user details, task details, and project details) is sent to the backend through HTTP requests.</li>
    <li>The backend processes these requests and performs the necessary database operations.</li>
    <li>The backend is also responsible for retrieving data from the database and sending it back to the frontend as JSON.</li>
</ul>

<h2>Installation Instructions</h2>
<p>To run this project locally, follow the steps below:</p>

<h3>1. Clone the repository</h3>
<pre><code>git clone https://github.com/yourusername/task-management-app.git</code></pre>

<h3>2. Frontend Setup</h3>
<ul>
    <li>Navigate to the <code>frontend</code> folder:</li>
    <pre><code>cd frontend</code></pre>
    <li>Install dependencies:</li>
    <pre><code>npm install</code></pre>
    <li>Start the frontend server:</li>
    <pre><code>npm start</code></pre>
</ul>

<h3>3. Backend Setup</h3>
<ul>
    <li>Navigate to the <code>backend</code> folder:</li>
    <pre><code>cd backend</code></pre>
    <li>Set up the MySQL database and configure <code>application.properties</code> with your database credentials.</li>
    <li>Build and run the Spring Boot application:</li>
    <pre><code>mvn spring-boot:run</code></pre>
</ul>

<h3>4. Access the Application</h3>
<ul>
    <li>The frontend will be running on <code>http://localhost:3000</code>.</li>
    <li>The backend will be running on <code>http://localhost:8084</code>.</li>
</ul>

<h2>How to Use</h2>
<ul>
    <li>Log in or create a new user.</li>
    <li>Add new tasks and assign them to users and projects.</li>
    <li>Edit or delete tasks, users, and projects.</li>
    <li>View tasks by their status (Pending, In Progress, Completed).</li>
</ul>

<h2>Future Enhancements</h2>
<ul>
    <li>Implement global state management (e.g., Redux) for better state handling.</li>
    <li>Add authentication and authorization features to manage user roles securely.</li>
    <li>Implement file uploads for task attachments.</li>
</ul>

<h2>Conclusion</h2>
<p>This Task Management Application is a robust solution for managing tasks, users, and projects efficiently. The integration between the React frontend and Spring Boot backend ensures seamless data flow and user interaction.</p>

</body>
</html>
