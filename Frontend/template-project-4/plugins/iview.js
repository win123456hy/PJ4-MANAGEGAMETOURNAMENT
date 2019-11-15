import Vue from "vue";
import iView from "iview";

Vue.use(iView);
Vue.prototype.$iview = iView;
Vue.prototype.$set = Vue.set;
