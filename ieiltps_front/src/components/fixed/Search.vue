<template>
  <div class="Search">
    <!-- 左边是一个图,作为返回主页的链接 -->
    <div class="left">
      <!-- style="width: 150px; height: 100px; left: 75px" -->
      <el-image
        @click="goHome()"
        style="width: 100%; height: 100px; left: 75px"
        src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
      ></el-image>
    </div>
    <!-- <div style="flex:1" ></div> -->
    <!-- 中间是一个搜索框，携带筛选搜索 -->
    <div class="mid">
      <el-input
        placeholder="请输入内容"
        prefix-icon="el-icon-search"
        v-model="input"
      >
      </el-input>
      <el-button type="primary">搜索</el-button>
    </div>
    <!-- 右边是俩个按钮,分别对应发布需求和出租设备 -->
    <div class="right">
      <el-button-group>
        <el-button type="primary">发布设备</el-button>
        <el-button type="primary">发布需求</el-button>
      </el-button-group>
    </div>
  </div>
</template>

<script>
export default {
  name: "Search",
  data() {
    return {
      input: "",
    };
  },
  methods: {
    goHome() {
      this.$router.push("/");
    },
  },
};
</script>

<style scoped>
.Search {
  display: flex;
  height: 100px;
  line-height: 20px;
  /* background-color: rgba(255, 106, 106, 0.5); */
  color: rgb(206, 20, 206);
}

.left {
  /* font-size: 170%; */
  /* float: left; */
  width: 300px;
  /* background-color: bisque; */
}
.mid {
  flex: 1;
  display: flex;
  align-items: center;
  text-align: center;
  margin-left: 200px;
  margin-right: 100px;
  margin-top: 25px;
  margin-bottom: 25px;
  /* background-color: rgba(255, 106, 106, 0.5); */
}
.right {
  /* background-color: rgba(255, 106, 106, 0.5); */
  display:flex;
  align-items: center;
  justify-content: center;
  width: 400px;
  margin-top: 25px;
  margin-bottom: 25px;
}
.el-button-group {
  bottom: 0%;
}
</style>

