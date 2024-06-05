// JavaScript to change text when button is clicked
document.getElementById('changeTextButton').addEventListener('click', function() {
    alert("The text will change now!");
    document.querySelector('main section p').textContent = 'The text has been changed!';
});
