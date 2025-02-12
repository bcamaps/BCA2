<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
// Retrieve form data
$name = $_POST["name"];
$email = $_POST["email"];
$message = $_POST["message"];

// Display submitted information
echo "<h2>Form Submission Result</h2>";
echo "<p><strong>Name:</strong> $name</p>";
echo "<p><strong>Email:</strong> $email</p>";
echo "<p><strong>Message:</strong> $message</p>";
} else {
// If accessed directly without submitting the form
echo "<p>Access denied.</p>";
}
?>