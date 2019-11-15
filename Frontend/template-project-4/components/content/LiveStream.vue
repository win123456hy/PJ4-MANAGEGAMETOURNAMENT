<template>
  <div id="live-stream">
    <div class="live-stream-inner">
      <div class="title-intro">
        <h3 class="section-title">WATCH LIVE STREAMS</h3>
        <div class="section-separator">
          <svg version="1.1" xmlns="http://www.w3.org/2000/svg"
               x="0px" y="0px" width="124.985px"
               height="3.411px" viewBox="0 0 124.985 3.411"
               enable-background="new 0 0 124.985 3.411"
               xml:space="preserve">
          <polygon fill="#FFFFFF" points="0,0 124.985,0 124.985,1.121 96.484,1.121 86.944,3.411 38.67,3.411 29.162,1.121 0,1.121 "></polygon>
        </svg>
        </div>
      </div>

      <div class="tabs-live-stream">
        <div class="tab-container">
          <input id="tab_youtube" type="radio" name="tabs" checked>
          <label for="tab_youtube">
            <span>Youtube</span>
          </label>

          <input id="tab_twitch" type="radio" name="tabs">
          <label for="tab_twitch">
            <span>Twitch</span>
          </label>

          <input id="tab_mixer" type="radio" name="tabs">
          <label for="tab_mixer">
            <span>Mixer</span>
          </label>

          <section id="content-youtube" class="tab-content">
            <YoutubeTab/>
          </section>
          <section id="content-twitch" class="tab-content">
            twitch
          </section>
          <section id="content-mixer" class="tab-content">
            mixer
          </section>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import YoutubeTab from '@/components/content/tab-live-stream/YoutubeTab.vue';

  export default {
    name: 'LiveStream',

    components: {
      YoutubeTab
    }
  }
</script>
