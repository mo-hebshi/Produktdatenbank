# Gruppe 8: Produktdatenbank Mohammed Al-Hebshi, Aschley Njiondop Ngoma
Dies ist eine RESTful-API-Anwendung zur Verwaltung von Produktinformationen. Sie ermöglicht grundlegende CRUD-Operationen (Erstellen, Lesen, Aktualisieren, Löschen) für Produkte. Die Anwendung wurde mit Spring Boot erstellt und nutzt Spring Data JPA für die Datenpersistenz mit einer H2-In-Memory-Datenbank.

# API-Endpunkte
GET /api/products/getAllProducts: Erhalten Sie eine Liste aller Produkte.
GET /api/products/getProductById/{productId}: Erhalten Sie Details zu einem bestimmten Produkt anhand der ID.
POST /api/products/addProduct: Fügen Sie ein neues Produkt hinzu. Senden Sie eine JSON-Payload mit den Produktinformationen (Name, Beschreibung, Preis).
PUT /api/products/updateProductById/{productId}: Aktualisieren Sie Details zu einem bestimmten Produkt anhand der ID. Senden Sie eine JSON-Payload mit den aktualisierten Produktinformationen.
DELETE /api/products/deleteProductById/{productId}: Löschen Sie ein bestimmtes Produkt anhand der ID.

# Fehlerbehandlung
Die Anwendung behandelt Fehler auf elegante Weise und gibt im Falle eines nicht gefundenen Produkts eine 404-Antwort mit einer entsprechenden Nachricht zurück.

