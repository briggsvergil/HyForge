<template>
  <div class="panel-body">
    <h1>Options</h1>
    <vue-form-generator
      :schema="schema"
      :model="model"
      :options="formOptions"
    ></vue-form-generator>
  </div>
</template>

<script>
import Vue from 'vue'
import VueFormGenerator from 'vue-form-generator'
import 'vue-form-generator/dist/vfg.css'
import json from 'static/options.json'
Vue.use(VueFormGenerator)

export default {
  data () {
    return json
  }
}
</script>
