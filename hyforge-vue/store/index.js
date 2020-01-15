export const state = () => ({
  chart: null
})

export const mutations = {
  SET_CHART (state, value) {
    console.log('SET_CHART', value)
    state.chart = value
  }
}
