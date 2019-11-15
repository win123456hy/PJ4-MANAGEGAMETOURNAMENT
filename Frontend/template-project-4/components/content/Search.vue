<template>
  <div class="search">
    <div class="search-inner">
      <div class="wrap-search">
        <input type="text" class="search-field" placeholder="Search..">
        <Icon type="ios-search"
              size="35"
              @click="isShowLine = true"
              class="search-icon"></Icon>
        <div class="line"></div>
      </div>
      <Icon type="md-close"
            @click="handleClose"
            size="30"
            class="close-search"/>
    </div>
  </div>
</template>

<script>

  export default {
    name: 'Search',

    data() {
      return {
        isShowLine: false
      }
    },

    methods: {
      handleClose() {
        this.$emit('on-close')
      }
    }
  }
</script>

<style lang="less" scoped>
  .search {
    position: fixed;
    width: 100%;
    height: 100%;
    top: 0;
    right: 0;
    z-index: 999;
    background: rgba(0,0,0,0.9);
  }

  .search-inner {
    width: 100%;
    height: 100%;
    display: flex;
    align-items: center;
    justify-content: center;

    .wrap-search {
      width: 55%;
      margin: auto;
      position: relative;

      .search-icon {
        position: absolute;
        top: 17px;
        right: 0;
        color: #ffffff;
        animation-name: showIcon;
        animation-duration: 1s;
      }

      .line {
        position: absolute;
        transition: width .5s ease .6s;
        left: 0;
        bottom: -16px;
        width: 100%;
        border-bottom: 4px solid #fff;
        animation-name: example;
        animation-duration: .8s;
      }
    }
  }

  .close-search {
    position: absolute;
    top: 50px;
    right: 50px;
  }

  .search-field {
    position: relative;
    height: 100%;
    width: 100%;
    margin: 0;
    padding: 0;
    font-family: inherit;
    font-size: 45px;
    font-weight: 700;
    color: #fff;
    line-height: 1em;
    background: 0 0;
    border: 0;
    border-radius: 0;
    outline: 0;
  }

  @keyframes example {
    from {width: 0;}
    to {width: 100%;}
  }

  @keyframes showIcon {
    from {opacity:0}
    99% {opacity: 0}
    to {opacity: 1}
  }
</style>
