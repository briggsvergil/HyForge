const api = require('express')()
const bp = require('body-parser')

module.exports = { path: '/api', handler: api }

api.use(bp.json())

let chartData = {}

api.post('/chart', (req, res) => {
  console.log('Chart POST received')
  chartData = req.body.chartData
  res.send('200: All good!')
})

api.get('/jchart', (req, res) => {
  console.log('Chart data on server: ' + chartData)
  res.send(chartData)
})
