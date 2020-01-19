<template>
  <chart
    :options="myChartOptions"
    :height="height"
    width="100%"
  />
</template>

<script>
import { Chart } from 'highcharts-vue'
// import Highcharts from 'highcharts/highcharts'
// import loadExporting from 'highcharts/modules/exporting'
// import brokenAxis from 'highcharts/modules/broken-axis'
import axios from '@nuxtjs/axios'
// import VWidget from '@/components/VWidget'
let data = {}

export default {
  // <!-- :series="mySeries" -->
  // <!-- :xlabels="myXlabels" -->
  name: 'HyCharts',
  components: {
    // VWidget,
    Chart
    // Highcharts,
    // loadExporting,
    // brokenAxis,
  },
  props: {
    // mySeries:Array,
    // myXlabels:Array,
    // height:String
  },
  async asyncData () {
    await axios.get('http://localhost:3000/api/jchart').then((res) => {
      const buff = Buffer.from(res.data, 'base64')
      const text = buff.toString('ascii')
      data = text
    }).catch((e) => {
      console.log(e)
    })
    console.log(data)
    return (data)
  },
  data () {
    return {
      myChartOptions: { data }
    }
  },
  created () {
    // loadExporting(Highcharts)
  },
  methods: {

  }
}
</script>
