<template>
  <div class="page-content-holder">
    <!--section description home page-->
    <div class="section-title-inner">
      <div class="section-title-holder">
        <h3 class="section-title">AN <span style="color: #ff0e1f">OP</span> THEME JUST FOR GAMERS</h3>
        <div class="section-separator">
          <svg version="1.1" xmlns="http://www.w3.org/2000/svg"
               x="0px" y="0px" width="124.985px"
               height="3.411px" viewBox="0 0 124.985 3.411"
               enable-background="new 0 0 124.985 3.411"
               xml:space="preserve">
          <polygon fill="#FFFFFF" points="0,0 124.985,0 124.985,1.121 96.484,1.121 86.944,3.411 38.67,3.411 29.162,1.121 0,1.121 "></polygon>
        </svg>
        </div>
        <div class="section-title-text">
        <span>
          Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor,
          nisi elit consequat ipsum, nec sagittis sem nibh id elit. Duis sed odio sit amet nibh vulputate cursus a sit
          amet mauris. Morbi accumsan ipsum velit. Nam nec tellus a odio tincidunt auctor a ornare odio sed non.
        </span>
        </div>
      </div>
    </div>
    <!--END section description home page-->

    <!--Blog list-->
    <BlogList/>
    <!--END Blog list-->

    <LiveStream/>

    <section class="introduce">
      <Row>
        <Col span="12">
          <div class="wrap-images-introduce">
            <img src="@/assets/images/h1-img-1.png" alt="">
          </div>
        </Col>
        <Col span="12">
          <div style="padding: 135px 0 0 0">
            <h4 class="introduce-title">
              GAME EXPO: <br> WHERE DIGITAL WORLDS <br> MEET REAL INNOVATION
            </h4>
            <a href="/" class="btn-view-profile">View Schedule</a>
          </div>
        </Col>
      </Row>
    </section>

    <Matches/>

    <div class="total-player">
      <div class="grid-section">
        <Row>
          <Col span="6">
            <div>
              <span class="counter">135</span>
              <p class="counter-title">Game played</p>
            </div>
          </Col>
          <Col span="6">
            <div>
              <span class="counter">89</span>
              <p class="counter-title">FLAGS TAKEN</p>
            </div>
          </Col>
          <Col span="6">
            <div>
              <span class="counter">32</span>
              <p class="counter-title">DEATHMATCHES</p>
            </div>
          </Col>
          <Col span="6">
            <div>
              <span class="counter">12</span>
              <p class="counter-title">TOURNAMENTS</p>
            </div>
          </Col>
        </Row>
      </div>
    </div>

    <div class="contact-us">
      <ContactUs/>
    </div>

    <section class="gallery-images">
      <GridGallery/>
    </section>

  </div>
</template>

<script>
  import BlogList from '@/components/content/BlogList.vue';
  import LiveStream from '@/components/content/LiveStream.vue';
  import Matches from '@/components/content/Matches.vue';
  import ContactUs from '@/components/content/ContactUs.vue';
  import GridGallery from '@/components/content/gallery/GridGallery.vue';

  export default {
    name: 'ContentHomePage',

    components: {
      BlogList,
      LiveStream,
      Matches,
      ContactUs,
      GridGallery
    }
  }
</script>
