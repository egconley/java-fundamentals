require('dotenv').config();
const express = require('express');
const app = express();
const bodyParser = require('body-parser');
app.use(bodyParser.json());
const pg = require('pg');
const cors = require('cors');
require('ejs');
const PORT = process.env.PORT || 3000;

app.use(express.urlencoded({ extended: true }));

let urlencodedParser = bodyParser.urlencoded({ extended: false });

app.set('view engine', 'ejs');
app.use(express.static('./public'));
app.set('views', __dirname + '/public/views');

const client = new pg.Client(process.env.DATABASE_URL);
client.connect();
client.on('error', err => console.error(err));

app.get('/', homePage);
