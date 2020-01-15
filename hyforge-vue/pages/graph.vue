<template>
  <section>
    <highcharts :options="chartOptions"/>
    <div>chart = {{ $store.state.chart }}</div>
  </section>
</template>

<script>
import Vue from 'vue'
import HighchartsVue from 'highcharts-vue'
Vue.use(HighchartsVue)
export default {
  data () {
    return this.$store.state.chart
  }
}
</script>
