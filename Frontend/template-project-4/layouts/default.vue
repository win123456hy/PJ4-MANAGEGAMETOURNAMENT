<template>
  <div>
    <Search v-if="isShowSearch" @on-close="isShowSearch = false"/>

    <MainMenu @on-open-search="handleOpen"/>
    <Banner/>

    <section id="page-content">
      <nuxt-child/>
    </section>

    <Footer/>
  </div>
</template>

<script>
  import Logo from '~/components/Logo.vue';
  import MainMenu from '~/components/menu/MainMenu.vue';
  import Banner from '~/components/menu/Banner.vue';
  import ContentHomePage from '~/components/content/ContentHomePage.vue';
  import Search from '@/components/content/Search.vue';
  import Footer from '@/components/Footer.vue';

  export default {
    components: {
      Logo,
      MainMenu,
      Banner,
      ContentHomePage,
      Search,
      Footer
    },

    data() {
      return {
        isShowSearch: false
      }
    },

    methods: {
      handleOpen() {
        this.isShowSearch = true
      }
    }
  }
</script>
