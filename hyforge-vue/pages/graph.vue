<template>
  <section>
    <h1>Chart From API</h1>
    <HyCharts
      :height="'300px'"
    />
  <!-- <highcharts :options=data /> -->
  </section>
</template>

<script>
import HyCharts from '~/components/HyCharts.vue'
export default {
  components: {
    HyCharts
  }
}
</script>
