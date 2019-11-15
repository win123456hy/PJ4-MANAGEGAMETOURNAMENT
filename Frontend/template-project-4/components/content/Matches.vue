<template>
  <div>
    <div class="matches-inner">
      <div class="title-intro">
        <h3 class="section-title">TRENDING MATCHES</h3>
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
          <input id="tab_all_matches" type="radio" name="tab" checked>
          <label for="tab_all_matches">
            <span>All Matches</span>
          </label>

          <input id="tab_upcoming" type="radio" name="tab">
          <label for="tab_upcoming">
            <span>Upcoming Matches</span>
          </label>

          <input id="tab_latest_results" type="radio" name="tab">
          <label for="tab_latest_results">
            <span>Latest Results</span>
          </label>

          <section id="content_all_matches" class="tab-content">
            <MatchesTabItem/>
          </section>
          <section id="content_upcoming" class="tab-content">
            twitch
          </section>
          <section id="content_latest_results" class="tab-content">
            mixer
          </section>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import MatchesTabItem from '@/components/content/tab-matches/MatchesTabItem.vue';

  export default {
    name: 'Matches',

    components: {
      MatchesTabItem
    }
  }
</script>
