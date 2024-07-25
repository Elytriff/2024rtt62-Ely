

document.getElementById('deleteCustomerLink').addEventListener('click', function(event) {
    // Evitar que el enlace se abra inmediatamente
    event.preventDefault();
    // Mostrar la ventana emergente
    document.getElementById('popup').style.display = 'block';
});

document.getElementById('confirmButton').addEventListener('click', function(event) {
    // Redirigir al enlace original si se confirma
    const customerId = event.target.getAttribute("data-customerId");
    window.location.href = "/customer/delete?customerId=" + customerId;
});

document.getElementById('cancelButton').addEventListener('click', function() {
    // Cerrar la ventana emergente si se cancela
    document.getElementById('popup').style.display = 'none';
});