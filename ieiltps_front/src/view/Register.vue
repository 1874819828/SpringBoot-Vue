<template>
  <div style="margin-top: 50px">
    <el-card class="box-card" shadow="hover">
      <h1 style="text-align: center">注册</h1>
      <el-row type="flex" class="row-bg" justify="center">
        <el-form class="demo-ruleForm">
          <el-form-item label="账号">
            <el-input
              v-model="form.username"
              placeholder="请输入账号"
            ></el-input>
          </el-form-item>

          <el-form-item label="密码">
            <el-input
              v-model="form.password"
              type="password"
              placeholder="请输入密码"
            ></el-input>
          </el-form-item>

          <el-form-item label="确认密码">
            <el-input
              v-model="form.check"
              type="password"
              placeholder="请输入密码"
            ></el-input>
          </el-form-item>

          <el-form-item label="昵称">
            <el-input
              v-model="form.nickname"
              placeholder="请输入昵称"
            ></el-input>
          </el-form-item>

          <el-form-item label="手机号码">
            <el-input
              v-model="form.phone"
              placeholder="请输入手机号码"
            ></el-input>
          </el-form-item>

          <el-form-item label="验证码">
            <el-input
              v-model="verify.code"
              placeholder="请输入验证码"
            ></el-input>
            <img
              :src="imageStr"
              alt="图片加载失败"
              @click="getImg"
              style="margin-left: 20%; margin-top: 20px"
            />
          </el-form-item>

          <el-form-item>
            <div style="margin-left: 30%">
              <el-button type="primary" @click="submit()">注册</el-button>
            </div>
          </el-form-item>
        </el-form>
      </el-row>
    </el-card>
  </div>
</template>
  
  <script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Register",
  data() {
    return {
      form: {
        username: "",
        password: "",
        check: "",
        nickname: "",
        phone: "",
      },
      verify: {
        id: "",
        code: "",
      },
      imageStr: "",
    };
  },
  methods: {
    submit() {
      this.$router.push("/login");
    },
    getImg() {
      console.log(this.imageStr);
    },
  },
  created() {
    // this.getImg();
  },
};
</script>
  
  <style scoped>
.box-card {
  width: 24%;
  height: 40%;
  margin-left: 38%;
  margin-right: 38%;
  opacity: 0.9;
  border-radius: 25px;
}
</style>