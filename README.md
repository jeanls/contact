# Contact

### Endpoints:
- POST      /api/save
- PUT       /api/update
- DELETE    /api/delete?id=1
- GET       /api/get?id=1

#### Json de entrada:
`{
 	"name": "Jean",
 	"phones": [
 	    {"number": "123456789", "phoneType": "MOBILE"}
 	]
 }`
 
 #### Banco de dados:
    Banco de dados utilizado é o H2 em memória, não necessita de configuração adicional.
    
    