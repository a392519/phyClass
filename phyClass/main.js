import Vue from 'vue'
import App from './App'
//公共api接口
Vue.prototype.apiServier="http://localhost:8080"


import VideoPlayer from 'vue-video-player'
require('video.js/dist/video-js.css')
require('vue-video-player/src/custom-theme.css')
Vue.use(VideoPlayer)

import LyTree from './pages/common/ly-tree/ly-tree.vue'
Vue.component('ly-tree',LyTree)


import videos from './pages/pmain/videos/videos.vue'
Vue.component('videos',videos)

import pmain from './pages/pmain/home/home.vue'
Vue.component('pmain',pmain)


import title1 from './pages/common/title1/title1.vue'
Vue.component('title1',title1)

import question from './pages/question/home/home.vue'
Vue.component('question',question)

import about from './pages/about/home/home.vue'
Vue.component('about',about)

import basics from './pages/basics/home.vue'
Vue.component('basics',basics)

import components from './pages/component/home.vue'
Vue.component('components',components)

import plugin from './pages/plugin/home.vue'
Vue.component('plugin',plugin)


import cuCustom from './colorui/components/cu-custom.vue'
Vue.component('cu-custom',cuCustom)

Vue.config.productionTip = false

App.mpType = 'app'

const app = new Vue({
    ...App
})
app.$mount()

 



