<template>
  <div class="container-inner post-content-wrapper">
    <Row :gutter="25">
      <Col span="16">
        <div class="post-content">
          <!-- Nội dung bài viết-->
          <div class="posts-content-inner">
            <div class="post-heading">
              <div class="post-image">
                <img src="@/assets/images/blog-2-img-3.jpg" alt="">
              </div>
            </div>

            <!--Nội dung bài viết-->
            <div class="post-text">
              <div class="flex-row middle post-info-top">
                <Tag class="cursor">June 4, 2018</Tag>
                <Tag class="cursor" color="#ff0e1f">by demoncleaner</Tag>
                <Tag class="cursor" color="#ff0e1f">esports</Tag>
              </div>

              <div class="post-text-main">
                <h4>WHITE KEEP ASSAULT</h4>
                <div class="post-text-main-inner">
                  <div class="content-element">
                  <span class="post-txt">
                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.
                    Cum sociis theme natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                    Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius
                    dius laoreet. Etiam ultricies nisi vel augue. Curabitur dui ullamcorper ultricies nisi nam eget.
                  </span>
                  </div>

                  <div class="content-element" style="padding: 25px 0">
                    <blockquote>
                      DONEC QUAM FELIS, ULTRICIES NEC, PELLENTESQUE EU, PRETIUM QUIS,
                      SEM. NULLA CONSEQUAT MASSA QUIS ENIM. DONEC PEDE JUSTO FRINGILLA VEL.
                    </blockquote>
                  </div>

                  <div class="content-element">
                  <span class="post-txt">
                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.
                    Cum sociis theme natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                    Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius
                    dius laoreet. Etiam ultricies nisi vel augue. Curabitur dui ullamcorper ultricies nisi nam eget.
                  </span>
                  </div>

                  <div class="post-images-gallery">
                    <Row :gutter="25">
                      <Col span="8">
                        <div class="post-image">
                          <img src="@/assets/images/blog-single-img-1.jpg" alt="">
                        </div>
                      </Col>
                      <Col span="8">
                        <div class="post-image">
                          <img src="@/assets/images/blog-single-img-2.jpg" alt="">
                        </div>
                      </Col>
                      <Col span="8">
                        <div class="post-image">
                          <img src="@/assets/images/blog-single-img-3.jpg" alt="">
                        </div>
                      </Col>
                    </Row>
                  </div>

                  <div class="content-element">
                  <span class="post-txt">
                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.
                    Cum sociis theme natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                    Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius
                    dius laoreet. Etiam ultricies nisi vel augue. Curabitur.
                  </span>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!--Bài viết liên quan-->
          <div class="related-post">
            <div class="title-blog">
              <span>RELATED POSTS</span>
            </div>

            <div class="list-related-post">
              <Row :gutter="20">
                <Col span="8">
                  <div class="related-image">
                    <img src="@/assets/images/blog-2-img-1.jpg" alt="">
                    <h6 class="related-title">WINNERS ON ESL PRO</h6>
                    <div class="post-info">
                      <a href="/">June 4, 2018 </a> by <a href="/">chinhdeptrai</a>
                    </div>
                  </div>
                </Col>
                <Col span="8">
                  <div class="related-image">
                    <img src="@/assets/images/blog-2-img-2.jpg" alt="">
                    <h6 class="related-title">WINNERS ON ESL PRO</h6>
                    <div class="post-info">
                      <a href="/">June 4, 2018 </a> by <a href="/">chinhdeptrai</a>
                    </div>
                  </div>
                </Col>
                <Col span="8">
                  <div class="related-image">
                    <img src="@/assets/images/blog-2-img-3.jpg" alt="">
                    <h6 class="related-title">WINNERS ON ESL PRO</h6>
                    <div class="post-info">
                      <a href="/">June 4, 2018 </a> by <a href="/">chinhdeptrai</a>
                    </div>
                  </div>
                </Col>
              </Row>
            </div>
          </div>
          <!--Nội dung comment-->
          <div class="blog-detail-comment">
            <div class="title-blog">
              <span>Comment</span>
            </div>

            <!--List Comment của bài viết-->
            <div class="list-comment-blog">
              <div class="comment-item">
                <div class="image-comment">
                  <img src="@/assets/images/team2-banner.png" alt="">
                </div>
                <div class="content-item-comment ">
                  <div class="info-comment flex-row space-between middle">
                    <div class="flex-column">
                      <span style="font-weight: bold;color: #ffffff;font-size: 18px;text-transform: uppercase">Chinh12hy</span>
                      <span style="font-size: 13px;">June 4, 2018</span>
                    </div>

                    <a href="/">Reppy</a>
                  </div>

                  <div class="text-comment">
                    <span>
                      Maecenas tempus, tellus eget condimentum rhoncus? Nam quam nunc, blandit vel,
                      luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus
                      vitae sapien ut libero? Venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget
                      eros. Donec vitae sapien ut libero venenatis faucibus.
                    </span>
                  </div>
                </div>
              </div>
            </div>

            <div class="comment-form">
              <CommentForm/>
            </div>
          </div>
        </div>
      </Col>

      <!--Slide Bar bên phải màn hinh-->
      <Col span="8">
        <div class="slide-bar-content">
          <!--Người viết-->
          <div class="author-post">
            <div class="author-image">
              <img src="@/assets/images/blog-author-img-1.jpg" alt="">
              <div class="author-text" style="padding: 15px">
                <h6 style="margin: 0">chinh pham duc</h6>
                <span>
                  Maecenas tempus, tellus eget luctus vel condimentum rhoncus,
                  sem quam semper libero, sit amet adipiscing sem neque sed ipsum, nam quam nunc.
                </span>
              </div>

              <div class="author-social-icon">
                <a href="https://www.facebook.com/" style="margin-right: 10px">
                  <Icon type="logo-facebook" />
                </a>
                <a href="https://www.youtube.com/">
                  <Icon type="logo-youtube" />
                </a>
              </div>
            </div>
          </div>

          <!--Category bài viết-->
          <div class="category">
            <div class="title-blog">
              <span>Category</span>
            </div>

            <div class="list-category">
              <div class="category-item">
                <span>Epic</span>
              </div>
              <div class="category-item">
                <span>Esports</span>
              </div>
              <div class="category-item">
                <span>Online</span>
              </div>
              <div class="category-item">
                <span>Legendary</span>
              </div>
            </div>
          </div>

          <!--Bài viết nổi bật-->
          <div class="trending-matches">
            <div class="title-blog">
              <span>Trending matches</span>
            </div>

            <div class="list-trending-matches">
              <div class="trending-matches-item">
                <a href="/" class="trending-link"></a>
                <div class="single-match-item">
                  <img src="@/assets/images/team2-banner.png" alt="">
                </div>
                <div class="matches-vs">
                  <img src="@/assets/images/vs_finished.png" alt="">
                </div>
                <div class="single-match-item">
                  <img src="@/assets/images/team3-banner.png" alt="">
                </div>
                <div class="trending-matches-info">
                  <span>26th Nov 2019, 15:00</span>
                </div>
                <div class="match-stream-holder">
                  <a href="/blogs/1">
                    <span style="font-weight: bold">10:15</span>
                  </a>
                </div>
              </div>
              <div class="trending-matches-item">
                <a href="/" class="trending-link"></a>
                <div class="single-match-item">
                  <img src="@/assets/images/team2-banner.png" alt="">
                </div>
                <div class="matches-vs">
                  <img src="@/assets/images/vs_dark.png" alt="">
                </div>
                <div class="single-match-item">
                  <img src="@/assets/images/team3-banner.png" alt="">
                </div>
                <div class="trending-matches-info">
                  <span>26th Nov 2019, 15:00</span>
                </div>
                <div class="match-stream-holder">
                  <a href="/blogs/1"><Icon type="md-play" /></a>
                </div>
              </div>
              <div class="trending-matches-item">
                <a href="/" class="trending-link"></a>
                <div class="single-match-item">
                  <img src="@/assets/images/team2-banner.png" alt="">
                </div>
                <div class="matches-vs">
                  <img src="@/assets/images/vs_dark.png" alt="">
                </div>
                <div class="single-match-item">
                  <img src="@/assets/images/team3-banner.png" alt="">
                </div>
                <div class="trending-matches-info">
                  <span>26th Nov 2019, 15:00</span>
                </div>
                <div class="match-stream-holder">
                  <a href="/blogs/1"><Icon type="md-play" /></a>
                </div>
              </div>
              <div class="trending-matches-item">
                <a href="/" class="trending-link"></a>
                <div class="single-match-item">
                  <img src="@/assets/images/team2-banner.png" alt="">
                </div>
                <div class="matches-vs">
                  <img src="@/assets/images/vs_dark.png" alt="">
                </div>
                <div class="single-match-item">
                  <img src="@/assets/images/team3-banner.png" alt="">
                </div>
                <div class="trending-matches-info">
                  <span>26th Nov 2019, 15:00</span>
                </div>
                <div class="match-stream-holder">
                  <a href="/blogs/1"><Icon type="md-play" /></a>
                </div>
              </div>
              <div class="trending-matches-item">
                <a href="/" class="trending-link"></a>
                <div class="single-match-item">
                  <img src="@/assets/images/team2-banner.png" alt="">
                </div>
                <div class="matches-vs">
                  <img src="@/assets/images/vs_dark.png" alt="">
                </div>
                <div class="single-match-item">
                  <img src="@/assets/images/team3-banner.png" alt="">
                </div>
                <div class="trending-matches-info">
                  <span>26th Nov 2019, 15:00</span>
                </div>
                <div class="match-stream-holder">
                  <a href="/blogs/1"><Icon type="md-play" /></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </Col>
    </Row>
  </div>
</template>

<script>
  import CommentForm from '@/components/post/post-detail/CommentForm.vue';

  export default {
    name: 'PostID',

    components: {
      CommentForm
    }

  }
</script>
