# tup2024

Endpoint POST /cliente/crearCliente Ejemplo:
{
  "dni": 39789454,
  "nombre": "Facundo",
  "apellido": "Reiseng",
  "fechaNacimiento": "1996-11-05",
  "tipoPersona": "FISICA",
  "banco": "Banco Nación"
}

Endpoint POST /cuenta/crearCuenta Ejemplo:
{
    "numeroCuenta": "1234567890",
    "fechaCreacion": "2024-12-06",
    "balance": 10000.50,
    "tipoCuenta": "AHORRO",
    "moneda": "USD",
    "titularDni": "12345678"
}

Endpoint POST /api/prestamo Ejemplo
{
  "dniCliente": 39789454,
  "plazo": 12,
  "monto": 5000.0,
  "moneda": "DOLARES"
}