-- Arquivo init.sql

-- Criação da base de dados
CREATE DATABASE xeeter;

-- Define a codificação da base de dados
ALTER DATABASE xeeter SET utf8;

-- Define a permissão para o usuário postgres (ou outro usuário que você definir)
GRANT ALL PRIVILEGES ON DATABASE xeeter TO xeeter_admin;
