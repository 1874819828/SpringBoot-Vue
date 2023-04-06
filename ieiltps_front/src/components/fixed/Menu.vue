<template>
  <div class="Menu">
    <el-menu
      :default-active="activeIndex2"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"
    >
      <el-menu-item index="1" @click="goHome">主页</el-menu-item>
      <el-submenu index="2">
        <template slot="title">全部产品</template>
        <el-submenu index="2-1">
          <template slot="title">设备</template>
          <el-menu-item index="2-1-1">挖掘机械</el-menu-item>
          <el-menu-item index="2-1-2">土方机械</el-menu-item>
          <el-menu-item index="2-1-3">动力设备</el-menu-item>
        </el-submenu>
        <el-submenu index="2-2">
          <template slot="title">仪器</template>
          <el-menu-item index="2-2-1">显微镜</el-menu-item>
          <el-menu-item index="2-2-2">扫描仪</el-menu-item>
          <el-menu-item index="2-2-3">碰撞机</el-menu-item>
        </el-submenu>
        <el-menu-item index="2-3">其他</el-menu-item>
      </el-submenu>
      <el-menu-item index="3" disabled>消息中心</el-menu-item>
      <el-menu-item index="4" @click="goOrderManager">订单管理
        <!-- <a target="_blank">订单管理</a> -->
      </el-menu-item>
      <el-menu-item index="5" @click="goList">列表</el-menu-item>
      <el-menu-item index="6" @click="goPerson">个人中心</el-menu-item>
    </el-menu>
    <Core></Core>
  </div>
</template>

<script>
import Core from "@/components/fixed/Core";
export default {
  name: "Menu",
  components: {
    Core,
  },
  data() {
    return {
      activeIndex: "1",
      activeIndex2: "1",
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
    goOrderManager(){
      this.$router.push("/Template/OrderManager");
    },
    goHome() {
      this.$router.push("/Template/Mhome");
    },
    goList() {
      this.$router.push("/Template/List");
    },
    goPerson() {
      this.$router.push("/Template/Person");
    },
  },
};
</script>

<style scoped>
</style>