<template>
  <!-- <div>我是个人中心</div> -->
  <div
    style="
      margin-left: 100px;
      margin-right: 100px;
      display: flex;
      height: 800px;
      align-items: center;
      justify-content: center;
      /* background-color: aquamarine; */
    "
  >
    <el-card shadow="hover" :body-style="{ padding: '0px' }">
      <div class="card">
        <!-- src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" -->
        <img :src="require('@/static/img/user.jpg')" class="image" />
        <h1 style="margin-bottom: 1px">基本信息</h1>
        <el-divider></el-divider>
      </div>
      <div>
        <el-tabs type="border-card">
          <el-tab-pane>
            <span slot="label"><i class="el-icon-date"></i> 基本信息</span>
            <BaseInformation></BaseInformation>
          </el-tab-pane>
          <el-tab-pane label="修改密码">修改密码</el-tab-pane>
          <!-- <el-tab-pane label="待付款">待付款</el-tab-pane>
          <el-tab-pane label="已完成">已完成</el-tab-pane> -->
        </el-tabs>
      </div>
      <!-- <div>修改密码</div> -->
    </el-card>
  </div>
</template>
<script>
import BaseInformation from "./PersonComponents/BaseInformation.vue";
export default {
  data() {
    return {
      currentDate: new Date(),
    };
  },
  components: {
    BaseInformation,
  },
  comments: {},
  created() {},
  computed: {},
  methods: {},
};
</script>
<style scoped>
.time {
  font-size: 13px;
  color: #999;
}

.bottom {
  margin-top: 13px;
  line-height: 12px;
}

.button {
  padding: 0;
  float: right;
}

.image {
  display: block;
  position: relative;
  width: 15%;
  height: 15%;
  border: 3px solid rgb(24, 147, 75);
  border-radius: 50%;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both;
}

.el-card {
  width: 100%;
  height: 100%;
  background-color: rgba(255, 255, 255, 0.3);
}
.card {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
</style>