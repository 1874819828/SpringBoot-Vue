<template>
  <div class="Header">
    <div class="left">
      <i class="el-icon-phone">99999999 88888888</i>
    </div>
    <div class="mid">
      <el-link :underline="false">关注平台</el-link>
      <el-link :underline="false">收藏本站</el-link>
      <el-link :underline="false">帮助中心</el-link>
      <el-link :underline="false">联系我们</el-link>
    </div>
    <div class="right">
      <el-link :underline="false" @click="login">登录</el-link>
      |
      <el-link :underline="false" @click="Register">注册</el-link>
      |
      <el-link :underline="false" @click="Backstage">后台</el-link>
    </div>
  </div>
</template>


<script>
export default {
  name: "Header",
  data() {
    return {
      input1: "",
      input2: "",
      input3: "",
      input4: "",
    };
  },
  components: {},
  created() {},
  computed: {},
  methods: {
    login(){
      this.$router.push('/login')
    },
    Register(){
      this.$router.push('/register')
    },
    Backstage(){
      this.$router.push('/backstage')
    }
  },
};
</script>

<style scoped>
.Header {
  /* font-size: 200%; */
  background-color: rgba(67, 205, 128, 0.5);
  color: #333;
  /* text-align: center; */
  line-height: 50px;
  display: flex;
}
.left {
  font-size: 170%;
  float: left;
  width: 300px;
}
.mid {
  flex: 1;
  text-align: center;
}
.right {
  float: right;
  text-align: right;
  width: 400px;
  margin-right: 30px;
}
.el-link {
  font-size: 130%;
}
</style>