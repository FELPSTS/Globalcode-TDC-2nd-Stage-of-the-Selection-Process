const express = require('express');
const path = require('path');

const app = express();
const port = 3000; 

app.use(express.static(path.join(__dirname, 'public')));

app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'Portal.html'));  // Altere para o nome correto do seu arquivo HTML
});

app.listen(port, () => {
  console.log(`Servidor rodando em http://localhost:${port}`);
});
