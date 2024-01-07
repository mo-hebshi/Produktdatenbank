# Gruppe 8: Produktdatenbank Mohammed Al-Hebshi, Aschley Njiondop Ngoma
Dies ist eine RESTful-API-Anwendung zur Verwaltung von Produktinformationen. Sie ermöglicht grundlegende CRUD-Operationen (Erstellen, Lesen, Aktualisieren, Löschen) für Produkte. Die Anwendung wurde mit Spring Boot erstellt und nutzt Spring Data JPA für die Datenpersistenz mit einer H2-In-Memory-Datenbank.

# API-Endpunkte
GET /api/products/getAllProducts: Erhalten Sie eine Liste aller Produkte.
GET /api/products/getProductById/{productId}: Erhalten Sie Details zu einem bestimmten Produkt anhand der ID.
POST /api/products/addProduct: Fügen Sie ein neues Produkt hinzu. Senden Sie eine JSON-Payload mit den Produktinformationen (Name, Beschreibung, Preis).
PUT /api/products/updateProductById/{productId}: Aktualisieren Sie Details zu einem bestimmten Produkt anhand der ID. Senden Sie eine JSON-Payload mit den aktualisierten Produktinformationen.
DELETE /api/products/deleteProductById/{productId}: Löschen Sie ein bestimmtes Produkt anhand der ID.

# Fehlerbehandlung
404 Not Found: Wird zurückgegeben, wenn ein Produkt mit der angegebenen ID nicht gefunden wurde.
500 Internal Server Error: Wird zurückgegeben, wenn ein interner Serverfehler auftritt.
400 Bad Request: Wird zurückgegeben, wenn die Anfrage nicht verarbeitet werden kann.

## Abhängigkeiten

- **Spring Boot:** 3.2.1
- **Spring Data JPA:** Für die Datenbankinteraktion.
- **Spring Web:** Für die RESTful-Endpunkte.
- **H2 Database:** Als eingebettete Datenbank.
- **Hibernate:** ORM für die Datenbankintegration.
