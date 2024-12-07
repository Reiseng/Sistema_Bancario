# tup2024

Endpoint POST /cliente/crearCliente Ejemplo:
{
  "dni": 58975421,
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
    "titularDni": "58975421"
}

Endpoint POST /api/prestamo Ejemplo
{
  "dniCliente": 58975421,
  "plazo": 12,
  "monto": 5000.0,
  "moneda": "DOLARES"
}
