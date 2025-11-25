// Declare variables
let userName = "Anshika";   // You can change the name
let currentHour = new Date().getHours(); // Get current hour (0–23)

// Display greeting based on time
if (currentHour < 12) {
    console.log(`Good Morning ${userName}!`);
}
else if (currentHour >= 12 && currentHour < 17) {
    console.log(`Good Afternoon ${userName}!`);
}
else {
    console.log(`Good Evening ${userName}!`);
}
