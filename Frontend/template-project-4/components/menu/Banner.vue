<template>
  <div class="banner">
    <div class="img-banner">
      <img src="@/assets/images/h1-slider-2-background-img.jpg"
           alt="">
      <div class="intro-banner">
        <div class="py-md txt-banner">Hello every body</div>
        <a href="#" class="flex-row center mt-md">
          <span class="btn-trapeze-left-side"></span>
          <span class="btn-intro-banner">Get Now</span>
          <span class="btn-trapeze-right-side"></span>
        </a>
      </div>
    </div>

    <div class="slide-show">
      <div class="slide-show-container">
        <ul class="flex-row center middle">
          <li><img src="@/assets/images/h1-client-img-1.png" alt=""></li>
          <li><img src="@/assets/images/h1-client-img-2.png" alt=""></li>
          <li><img src="@/assets/images/h1-client-img-3.png" alt=""></li>
          <li><img src="@/assets/images/h1-client-img-4.png" alt=""></li>
          <li><img src="@/assets/images/h1-client-img-5.png" alt=""></li>
          <li><img src="@/assets/images/h1-client-img-6.png" alt=""></li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Banner'
  }
</script>
