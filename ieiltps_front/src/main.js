import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import router from './router'
import store from 'vuex'
import './mock'
import axios from 'axios'
import * as echarts from 'echarts';

import api from './api'
// api.commonUrl

Vue.config.productionTip = false

axios.defaults.baseURL = api.commonUrl,
Vue.prototype.$axios = axios
Vue.prototype.$echarts = echarts


Vue.use(ElementUI)

new Vue({
  render: h => h(App),
  router,
  store

}).$mount('#app')
