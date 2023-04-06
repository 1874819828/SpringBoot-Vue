<template>
  <div style="margin-top: 50px">
    <el-card class="box-card" shadow="hover">
      <h1 style="text-align: center">登录</h1>
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
              type="password"
              v-model="form.password"
              placeholder="请输入密码"
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
              <el-button type="primary" @click="submit()">登录</el-button>
              <el-button type="primary" @click="goregister()">注册</el-button>
            </div>
          </el-form-item>
        </el-form>
      </el-row>
    </el-card>
  </div>
</template>
<script>
// import { response } from "express";

export default {
  data() {
    return {
      form: {
        username: "",
        password: "",
      },
      verify: {
        id: "",
        code: "",
      },
      imageStr: "",
    };
  },
  created() {},
  computed: {},
  methods: {
    goregister() {
      this.$router.push("/register");
    },
    submit() {
      this.$router.push("/");
    },
    getImg() {
      this.$axios
        .get("/Login")
        .then((res) => {
          console.log(res.data.data);
          // console.log(this.imageStr);
          // this.verify.code = res.data.data.nickname;
        })
        .catch((err) => {
          console.log(err);
        });
      // console.log(this.imageStr);
    },
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