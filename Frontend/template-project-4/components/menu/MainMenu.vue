<template>
  <div class="main-menu">
    <div class="menu-area">
      <!--Left Main Menu-->
      <div class="menu-position-left">
        <!--Icon Search here-->
        <div class="flex-row middle" style="width: 130px">
          <Icon type="ios-search" size="30" @click="openSearchForm"/>
        </div>
        <!--END Icon Search here-->

        <div class="menu-position-left-inner">
          <div class="menu-position-left-inner-border-holder"></div>
          <div class="menu-position-left-top">
            <span>folow us on: </span>
            <div class="list-icon-contact">
              <Icon type="logo-facebook" />
              <Icon type="logo-youtube" />
              <Icon type="logo-instagram" />
              <Icon type="logo-twitter" />
            </div>
          </div>
          <div class="menu-position-left-bottom">
            <nav>
              <ul class="flex-row menu-device">
                <li><a href="#"> Home </a></li>
                <li><a href="#"> Pages </a></li>
                <li><a href="#"> Contact </a></li>
              </ul>
            </nav>
          </div>
        </div>
      </div>
      <!--END Left Main Menu-->

      <!--Center Main Menu-->
      <div class="menu-position-center">
        <div class="menu-position-center-inner">
          <div class="logo-wrapper">
            <a href="/" style="height: 84px">
              <img itemprop="image"
                   class="edgtf-normal-logo"
                   src="https://playerx.edge-themes.com/wp-content/uploads/2018/06/logo-divided-header.png"
                   width="84" height="84px" alt="logo">
            </a>
          </div>
        </div>
      </div>
      <!--END Center Main Menu-->

      <!--Right Main Menu-->
      <div class="menu-position-right">
        <div class="menu-position-left-inner">
          <div class="menu-position-right-inner-border-holder"></div>
          <div class="menu-position-left-top">
            <span>this is playerx, a theme for games, clans & esports</span>
            <div class="flex-row">
            </div>
          </div>
          <div class="menu-position-left-bottom">
            <nav>
              <ul class="menu-device flex-row">
                <li><a href="#"> Blogs </a></li>
                <li><a href="#"> About </a></li>
                <li><a href="#"> Hotline </a></li>
              </ul>
            </nav>
          </div>
        </div>
        <div class="flex-row middle center" style="width: 130px">
          <a href="#" class="slide-menu-button">
            <svg version="1.1" class="edgtf-side-area-opener" xmlns="http://www.w3.org/2000/svg"
                 xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="23.922px" height="23.916px"
                 viewBox="0 0 23.922 23.916" enable-background="new 0 0 23.922 23.916" xml:space="preserve">
            <rect x="2.604" y="14.698" transform="matrix(0.7071 0.7071 -0.7071 0.7071 14.9741 2.3277)" fill="#ffffff" width="4.146"
                  height="9.083"></rect>
              <rect x="17.166" y="0.135" transform="matrix(0.7072 0.707 -0.707 0.7072 8.9391 -12.2324)" fill="#ffffff"
                    width="4.145" height="9.083"></rect>
              <rect x="2.61" y="0.141" transform="matrix(-0.7071 0.7071 -0.7071 -0.7071 11.3045 4.6818)" fill="#ffffff"
                    width="4.145" height="9.083"></rect>
              <rect x="17.172" y="14.703" transform="matrix(-0.7071 0.7071 -0.7071 -0.7071 46.4606 19.2446)"
                    fill="#ffffff" width="4.146" height="9.083"></rect>
</svg>
          </a>
        </div>
      </div>
      <!--END Right Main Menu-->
    </div>
  </div>
</template>

<script>

  export default {
    name: 'MainMenu',

    data() {
      return {}
    },

    methods: {
      openSearchForm() {
        this.$emit('on-open-search');
      }
    }
  }
</script>
