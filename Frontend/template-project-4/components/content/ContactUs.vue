<template>
  <Row>
    <Col span="12">
      <div class="contact-inner">
        <div class="contact-intro">
          <h4 class="section-title">Contact us</h4>
          <div class="section-separator">
            <svg version="1.1" xmlns="http://www.w3.org/2000/svg"
                 x="0px" y="0px" width="124.985px"
                 height="3.411px" viewBox="0 0 124.985 3.411"
                 enable-background="new 0 0 124.985 3.411"
                 xml:space="preserve">
            <polygon fill="#FFFFFF" points="0,0 124.985,0 124.985,1.121 96.484,1.121 86.944,3.411 38.67,3.411 29.162,1.121 0,1.121 "></polygon>
          </svg>
          </div>
          <p style="padding: 15px 0">
            Proin gravida nibh vel velit auctor aliquet. Aenean velit sollicitudin,
            lorem quis bibendum auctor, nisi elit ipsum consequat ipsum, nec sagittis sem nibh id elit.
            Duis sed odio sit amet nibh vulputate cursus a sit amet mauris.
          </p>
          <div class="flex-row middle">
            <Icon type="ios-navigate" style="margin-right: 10px" size="22"/>
            <a href="">
              <span class="contact-text"> 1130 De La Thanh Ha Noi city</span>
            </a>
          </div>
          <div class="flex-row middle">
            <Icon type="md-mail" style="margin-right: 10px" class="mr-sm" size="22"/>
            <a href="mailto:chinh12hy@gmail.com">
              <span class="contact-text"> chinh12hy@gmail.com</span>
            </a>

          </div>
        </div>
      </div>
    </Col>
    <Col span="12">
      <div class="form-contact">
        <div class="flex-column">
          <input type="text" placeholder="Your name"/>
          <input type="text"  placeholder="Email Address"/>
          <textarea cols="30" rows="10" placeholder="Your message"></textarea>
          <button class="btn-submit">Submit</button>
        </div>
      </div>
    </Col>
  </Row>
</template>

<script>

  export default {
    name: 'Contactus'
  }
</script>
