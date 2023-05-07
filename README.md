
# Requeriments
- User profile
- Modification of profile data
- Appointment creation
- Appointment modification
- Cancellation of appointments
- See all appointments I have as a client

### (as a dentist)
- View all existing appointments
- View all registered customers

# Endpoints
### All endpoints will start with "/api".
## Client endpoints

- GET /client -> List all clients.
- GET /client/{id} -> Get an specitic client.
- GET /client/odontologist -> List odontologists for client.
- GET /client/{clientId}/visit -> List visits for client.
- POST /client -> Insert a client.
- PUT /client/{id} -> Update an specific client.
- DELETE /client/{id} -> Delete an specific client.

## Odontologist endpoints

- GET /odontologist -> List all odontologist.
- GET /odontologist/{id} -> Get and specific odontologist.
- GET /odontologist/{odontologistId}/visit -> Get list of visits for odontologist.
- POST /odontologist -> Insert an odontologist.
- PUT /odontologist/{id} -> Update an specific odontologist.
- DELETE /odontologist/{id} -> Delete a specific odontologist.

## Visit endpoints

- GET /visit -> List all visits.
- GET /visit/{id} -> Get an specitic visit.
- GET /visit/odontologist/{odontologistId}
- GET /visit/client/{clientId} -> List visits for client.
- POST /visit -> Insert a visit.
- PUT /visit/{id} -> Update an specific visit.
- DELETE /visit/{id} -> Delete an specific visit.
