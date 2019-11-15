
export default {
  mode: 'universal',
  /*
  ** Headers of the page
  */
  head: {
    title: 'Web giúp xem thông tin các trận đấu',
    meta: [
      { charset: 'utf-8' },
      { name: 'viewport', content: 'width=device-width, initial-scale=1' },
      { hid: 'description', name: 'description', content: process.env.npm_package_description || '' }
    ],
    link: [
      { rel: 'icon', type: 'image/x-icon', href: '/logo.png' },
      { rel: 'stylesheet', href: 'https://fonts.googleapis.com/css?family=Rubik&display=swap'},
      { rel: 'stylesheet', type: 'text/css', href: 'http://unpkg.com/view-design/dist/styles/iview.css'},
    ]
  },
  /*
  ** Customize the progress-bar color
  */
  loading: { color: '#fff' },
  /*
  ** Global CSS
  */
  css: [
    '@/assets/less/main.less',
  ],
  /*
  ** Plugins to load before mounting the App
  */
  plugins: [
    { src: '@/plugins/iview', ssr: true },
  ],
  /*
  ** Nuxt.js dev-modules
  */
  buildModules: [
  ],
  /*
  ** Nuxt.js modules
  */
  modules: [
  ],
  /*
  ** Build configuration
  */
  build: {
    /*
    ** You can extend webpack config here
    */
    extend (config, ctx) {
    }
  }
}
