## - Comando para criar container docker com postgresql
docker run --name postgres-dio -e POSTGRES_PASSWORD=root 
-e POSTGRES_USER=academia -e POSTGRES_DB=academia 
-p 5432:5432 -d postgres