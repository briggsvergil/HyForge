<template>
    <highcharts :options="chartOptions"></highcharts>
</template>

<script>
import Vue from 'vue'
import HighchartsVue from 'highcharts-vue'
Vue.use(HighchartsVue)
export default {
  data () {
    return this.$app.ChartOpts
  }
}
</script>
