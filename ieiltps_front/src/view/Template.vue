<template>
  <div>
    <Header />
    <Search/>
    <Menu />
    <!-- <Core /> -->
    <Phone />
    <Footer />
  </div>
</template>


<script>
import Header from "@/components/fixed/Header";
import Search from "@/components/fixed/Search";
import Menu from "@/components/fixed/Menu";
import Core from "@/components/fixed/Core";
import Phone from "@/components/fixed/Phone";
import Footer from "@/components/fixed/Footer";

export default {
  name: "Template",
  components: {
    Header,
    Search,
    Menu,
    Core,
    Phone,
    Footer,
  },
};
</script>
  

<style scoped>

</style>