<template>
  <div style="margin-left: 100px; margin-right: 100px">
    <el-tabs v-model="activeName" @tab-click="handleClick">
      <el-tab-pane label="待付款" name="first">
        <Payment></Payment>
      </el-tab-pane>
      <el-tab-pane label="已发布" name="second">已发布</el-tab-pane>
      <el-tab-pane label="已完成" name="third">已完成</el-tab-pane>
    </el-tabs>
  </div>
</template>
<script>
import Payment from "./OrderComponents/Payment.vue";
export default {
  data() {
    return { activeName: "first" };
  },
  components: { Payment },
  mounted: {},
  created() {},
  computed: {},
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    },
  },
};
</script>
<style scoped>
</style>